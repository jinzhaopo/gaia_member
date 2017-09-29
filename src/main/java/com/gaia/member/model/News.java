package com.gaia.member.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nt.framework.model.BaseEntity;

/**
 * 
 * @ClassName: News
 * @Description: 新闻稿
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月26日 上午9:21:06
 */
@Table(name = "ceo_news")
public class News extends BaseEntity {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 9058921904370930020L;
	/**
	 * word
	 */
	@Column(nullable = false)
	private String wordUrl;
	/**
	 * 主题
	 */
	@Column(nullable = false)
	private String themes;
	/**
	 * 截至日期
	 */
	@Column(nullable = false, name = "close_date")
	@JsonFormat(pattern = "yyyy/MM/dd", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date closeDate;
	/**
	 * 总票数
	 */
	@Min(0)
	@Column(nullable = false)
	private int votes;
	/**
	 * 票的类型
	 */
	@Column(nullable = false)
	private String types;

	/************* link ***************/
	/**
	 * 所属公司ID
	 */
	@Column(name = "coy_id", nullable = false)
	private Long coyId;

	public String getWordUrl() {
		return wordUrl;
	}

	public void setWordUrl(String wordUrl) {
		this.wordUrl = wordUrl;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Long getCoyId() {
		return coyId;
	}

	public void setCoyId(Long coyId) {
		this.coyId = coyId;
	}

}
