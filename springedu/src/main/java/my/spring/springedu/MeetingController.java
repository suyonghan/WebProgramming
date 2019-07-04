package my.spring.springedu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.MeetingDAO;
import vo.MeetingVO;

@Controller
public class MeetingController {
	@Autowired
	MeetingDAO dao;

	@RequestMapping("/meeting")
	protected ModelAndView select(MeetingVO vo, String keyword, String action) {
		ModelAndView mav = new ModelAndView();
		System.out.println(vo.toString());
		System.out.println(action);
		if (action != null && action.equals("insert")) {
			boolean result = dao.insert(vo);
			if (result) {
				mav.addObject("msg", "성공적으로 저장되었어요.");
			} else {
				mav.addObject("msg", "작성을 실패했어요.");
			}
		} else if (action != null && !action.equals("insert")) {
			vo.setId(Integer.parseInt(action));
			boolean result = dao.update(vo);
			if (result) {
				mav.addObject("msg", vo.getId() + "번 글이 업데이트 되었습니다.");
			} else {
				mav.addObject("msg", vo.getId() + "번 글이 존재하지 않습니다.");
			}
			List<MeetingVO> list = dao.listAll();
			if (list.size() != 0) {
				mav.addObject("list", list);
			} else {
				mav.addObject("msg", "추출된 미팅 정보가 없습니다.");
			}
		} else if (vo.getId() == 0 && keyword == null) {
			List<MeetingVO> list = dao.listAll();
			if (list.size() != 0) {
				mav.addObject("list", list);
			} else {
				mav.addObject("msg", "추출된 미팅 정보가 없습니다.");
			}
		} else if (vo.getId() != 0) {
			boolean result = dao.delete(vo.getId());
			if (result) {
				mav.addObject("msg", vo.getId() + "번 글이 삭제되었습니다.");
			} else {
				mav.addObject("msg", vo.getId() + "번 글이 존재하지 않습니다.");
			}
			List<MeetingVO> list = dao.listAll();
			if (list.size() != 0) {
				mav.addObject("list", list);
			} else {
				mav.addObject("msg", "추출된 미팅 정보가 없습니다.");
			}
		} else {
			System.out.println("22");
			List<MeetingVO> list = dao.search(keyword);
			if (list.size() != 0) {
				mav.addObject("list", list);
			} else {
				mav.addObject("msg", keyword + "로 검색된 미팅 정보가 없습니다.");
			}
		}
		mav.setViewName("meetingView2");
		return mav;
	}
}
