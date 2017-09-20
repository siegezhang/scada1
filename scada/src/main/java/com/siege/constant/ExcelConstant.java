package com.siege.constant;

public interface ExcelConstant {
	public static final String ANTING_TITLE[] = { "时间",       "入口压力(MPa)",   "A出口压力(MPa)",       "B出口压力(MPa)", "储气罐压力A(MPa)", "储气罐压力B(MPa)", "回水温度(°C)", "A出口温度(°C)", "B出口温度(°C)", "A总量(KG)", "B总量(KG)", "气体压力A(MPa)", "气体压力B(MPa)", "气体温度A(°C)", "气体温度B(°C)" };
	public static final String ANTING_FIELD[] = { "SHARPTIME", "COMPRESSOR_P", "CP10A_P",            "CP10B_P",     "T852_P",        "T853_P",        "HE109_T",   "CP10A_T",     "CP10B_T",    "AI29",     "AI30",     "AI015",       "AI016",        "AI013",      "AI014" };
	
	public static final String YUNFU_TITLE[] = {"时间",		 "加氢机A单次加气量","加氢机A环境温度",  "加氢机A瞬时压力","加氢机A瞬时流量", "加氢机A加氢价格","加氢机A累计加氢量", "加氢机A结束压力","加氢机A起始压力", "加氢机A目标压力","加氢机B单次加气量", "加氢机B环境温度","加氢机B瞬时压力","加氢机B瞬时流量","加氢机B加氢价格","加氢机B累计加氢量","加氢机B结束压力","加氢机B起始压力","加氢机B目标压力","排气压力1",	  "进气压力1",	   "排气温度1",     "排气压力2",    "进气压力2",    "排气温度2",    "高压储罐压力",    "中压储罐压力",    "低压储罐压力"};
	public static final String YUNFU_FIELD[] = {"SHARPTIME", "MH2_A",       "AT_A",         "Plinest_A", "Llinest_A",  "PRISE_A",    "ALLMH2_A",     "Pend_A",    "P0_A",        "Ptarget_A",  "MH2_B",        "AT_B",      "Plinest_B",  "Llinest_B", "PRISE_B",	 "ALLMH2_B",	"Pend_B",	 "P0_B",	   "Ptarget_B", "Pout_H2_1_1","Pin_H2_1_1","Tout_H2_1_1","Pout_H2_2_1","Pin_H2_2_1","Tout_H2_2_1","P_H_tank_2_1","P_M_TANK_2_1","P_L_TANK_2_1" };
}
