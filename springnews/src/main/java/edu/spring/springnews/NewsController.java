package edu.spring.springnews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.NewsDAO;
import vo.NewsVO;

@Controller
public class NewsController {
	@Autowired
	NewsDAO dao;

	@RequestMapping(value = "/news", method = RequestMethod.GET)
	protected ModelAndView doGet(String listwriter, NewsVO vo, String action, String key, String id, String content,
			String searchType, String select) {
		ModelAndView mav = new ModelAndView();
		if (action != null) {
			if (id != null && action.equals("delete")) {
				boolean result = dao.delete(Integer.parseInt(id));
				System.out.println(result);
				if (result)
					mav.addObject("msg", "삭제완료");
				else
					mav.addObject("msg", "삭제실패");
				mav.addObject("list", dao.listAll());
			} else if (action.equals("search")) {
				mav.addObject("list", dao.search(key, searchType));
			} else if (action.equals("listwriter")) {
				mav.addObject("list", dao.select(listwriter));
			}
		} else {
			if (id != null) {
				dao.update(dao.listOne(Integer.parseInt(id)));
			}
			List<NewsVO> list = dao.listAll();
			if (list.size() == 0) {
				mav.addObject("msg", "없어요");
			} else {
				mav.addObject("list", list);
			}

		}
		mav.setViewName("news");
		return mav;
	}

	@RequestMapping(value = "/news", method = RequestMethod.POST)
	protected ModelAndView doPost(NewsVO vo, String action, String writer, String title, String content, String id) {
		ModelAndView mav = new ModelAndView();
		boolean result;
		if (action.equals("insert")) {
			result = dao.insert(vo);
			if (result) {
				mav.addObject("msg", writer + "입력완료");
			} else {
				mav.addObject("msg", writer + "실패");
			}
		} else {
			vo.setId(Integer.parseInt(action));
			result = dao.update(vo);

			if (result) {
				mav.addObject("msg", writer + "성공");
			} else {
				mav.addObject("msg", writer + "실패.");
			}
		}
		mav.addObject("list", dao.listAll());
		mav.setViewName("news");
		return mav;
	}
}
