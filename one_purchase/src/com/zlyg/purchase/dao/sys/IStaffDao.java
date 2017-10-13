package com.zlyg.purchase.dao.sys;

import com.zlyg.purchase.common.PageNavigation;
import com.zlyg.purchase.model.sys.SysStaff;





public interface IStaffDao {

	//分页获取数据
	public PageNavigation<SysStaff> getPageData(PageNavigation<SysStaff>page);
	
	//添加用户信息
	public String addStaff(SysStaff staff);
	
	//分页获取黑名单数据
	public PageNavigation<SysStaff>getBlackList(PageNavigation<SysStaff>page);
	
	//洗白黑名单的数据
	public String washWhite(SysStaff staff);
	
	//关键字查询白名单数据
	public PageNavigation<SysStaff> quPageData(PageNavigation<SysStaff>page,SysStaff staff);
	
	//关键字查询黑名单数据
	public PageNavigation<SysStaff> quhPageData(PageNavigation<SysStaff>page,SysStaff staff);
	
	//员工信息编辑
	public int 	StaffEdit(SysStaff staff) throws Exception;

	// 根据ID查询
	public SysStaff fine(SysStaff staff);
	
	//拉黑面试个人信息
	public String blackList(String id);
	
	public int getId();

	
}