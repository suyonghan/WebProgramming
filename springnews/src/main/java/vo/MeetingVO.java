package vo;

public class MeetingVO {
	private int id;
	private String name;
	private String title;
	private String meetingdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMeetingdate() {
		return meetingdate;
	}

	public void setMeetingdate(String meetingdate) {
		this.meetingdate = meetingdate;
	}

	@Override
	public String toString() {
		return "MeetingVO [id=" + id + ", name=" + name + ", title=" + title + ", dateTime=" + meetingdate + "]";
	}

}
