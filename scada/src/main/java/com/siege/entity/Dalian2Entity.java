package com.siege.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, 
				getterVisibility = JsonAutoDetect.Visibility.NONE, 
				setterVisibility = JsonAutoDetect.Visibility.NONE, 
				creatorVisibility = JsonAutoDetect.Visibility.NONE)
public class Dalian2Entity {
	@JsonProperty("PI02_1_AI") private float PI02_1_AI;
	@JsonProperty("PI02_2_AI") private float PI02_2_AI;
	@JsonProperty("PI02_3_AI") private float PI02_3_AI;
	@JsonProperty("PI01_1_AI") private float PI01_1_AI;
	@JsonProperty("MF01_1_AI") private float MF01_1_AI;
	@JsonProperty("MF01_3_AI") private float MF01_3_AI;
	@JsonProperty("MF01_2_DI") private float MF01_2_DI;
	@JsonProperty("TT01_1_AI") private float TT01_1_AI;
	@JsonProperty("ER3000_PS_MPa") private float ER3000_PS_MPa;
	@JsonProperty("VECH_P") private float VECH_P;
	@JsonProperty("VECH_T") private float VECH_T;
	@JsonProperty("VECH_V") private float VECH_V;
	@JsonProperty("P_L") private float P_L;
	@JsonProperty("P_H") private float P_H;
	@JsonProperty("T_H") private float T_H;
	@JsonProperty("ALLMESS_H2") private float ALLMESS_H2;
	@JsonProperty("Ptarget") private float Ptarget;
	@JsonProperty("Ptaaget_in") private float Ptaaget_in;
	@JsonProperty("Pend_VECH") private float Pend_VECH;
	@JsonProperty("Count_1s") private float Count_1s;
	@JsonProperty("APPR") private float APPR;
	@JsonProperty("P0station") private float P0station;
	@JsonProperty("APPR_NOW") private float APPR_NOW;
	@JsonProperty("P0vech") private float P0vech;
	@JsonProperty("ER3000_PS_bar") private float ER3000_PS_bar;
	@JsonProperty("PPL") private float PPL;
	@JsonProperty("PPM") private float PPM;
	@JsonProperty("PPH") private float PPH;
	@JsonProperty("IWO_V") private float IWO_V;
	@JsonProperty("IW0_P") private float IW0_P;
	@JsonProperty("IW2_T") private float IW2_T;
	@JsonProperty("L0_H") private float L0_H;
	@JsonProperty("Pend_STATION") private float Pend_STATION;
	public float getPI02_1_AI() {
		return PI02_1_AI;
	}
	public void setPI02_1_AI(float pI02_1_AI) {
		PI02_1_AI = pI02_1_AI;
	}
	public float getPI02_2_AI() {
		return PI02_2_AI;
	}
	public void setPI02_2_AI(float pI02_2_AI) {
		PI02_2_AI = pI02_2_AI;
	}
	public float getPI02_3_AI() {
		return PI02_3_AI;
	}
	public void setPI02_3_AI(float pI02_3_AI) {
		PI02_3_AI = pI02_3_AI;
	}
	public float getPI01_1_AI() {
		return PI01_1_AI;
	}
	public void setPI01_1_AI(float pI01_1_AI) {
		PI01_1_AI = pI01_1_AI;
	}
	public float getMF01_1_AI() {
		return MF01_1_AI;
	}
	public void setMF01_1_AI(float mF01_1_AI) {
		MF01_1_AI = mF01_1_AI;
	}
	public float getMF01_3_AI() {
		return MF01_3_AI;
	}
	public void setMF01_3_AI(float mF01_3_AI) {
		MF01_3_AI = mF01_3_AI;
	}
	public float getMF01_2_DI() {
		return MF01_2_DI;
	}
	public void setMF01_2_DI(float mF01_2_DI) {
		MF01_2_DI = mF01_2_DI;
	}
	public float getTT01_1_AI() {
		return TT01_1_AI;
	}
	public void setTT01_1_AI(float tT01_1_AI) {
		TT01_1_AI = tT01_1_AI;
	}
	public float getER3000_PS_MPa() {
		return ER3000_PS_MPa;
	}
	public void setER3000_PS_MPa(float eR3000_PS_MPa) {
		ER3000_PS_MPa = eR3000_PS_MPa;
	}
	public float getVECH_P() {
		return VECH_P;
	}
	public void setVECH_P(float vECH_P) {
		VECH_P = vECH_P;
	}
	public float getVECH_T() {
		return VECH_T;
	}
	public void setVECH_T(float vECH_T) {
		VECH_T = vECH_T;
	}
	public float getVECH_V() {
		return VECH_V;
	}
	public void setVECH_V(float vECH_V) {
		VECH_V = vECH_V;
	}
	public float getP_L() {
		return P_L;
	}
	public void setP_L(float p_L) {
		P_L = p_L;
	}
	public float getP_H() {
		return P_H;
	}
	public void setP_H(float p_H) {
		P_H = p_H;
	}
	public float getT_H() {
		return T_H;
	}
	public void setT_H(float t_H) {
		T_H = t_H;
	}
	public float getALLMESS_H2() {
		return ALLMESS_H2;
	}
	public void setALLMESS_H2(float aLLMESS_H2) {
		ALLMESS_H2 = aLLMESS_H2;
	}
	public float getPtarget() {
		return Ptarget;
	}
	public void setPtarget(float ptarget) {
		Ptarget = ptarget;
	}
	public float getPtaaget_in() {
		return Ptaaget_in;
	}
	public void setPtaaget_in(float ptaaget_in) {
		Ptaaget_in = ptaaget_in;
	}
	public float getPend_VECH() {
		return Pend_VECH;
	}
	public void setPend_VECH(float pend_VECH) {
		Pend_VECH = pend_VECH;
	}
	public float getCount_1s() {
		return Count_1s;
	}
	public void setCount_1s(float count_1s) {
		Count_1s = count_1s;
	}
	public float getAPPR() {
		return APPR;
	}
	public void setAPPR(float aPPR) {
		APPR = aPPR;
	}
	public float getP0station() {
		return P0station;
	}
	public void setP0station(float p0station) {
		P0station = p0station;
	}
	public float getAPPR_NOW() {
		return APPR_NOW;
	}
	public void setAPPR_NOW(float aPPR_NOW) {
		APPR_NOW = aPPR_NOW;
	}
	public float getP0vech() {
		return P0vech;
	}
	public void setP0vech(float p0vech) {
		P0vech = p0vech;
	}
	public float getER3000_PS_bar() {
		return ER3000_PS_bar;
	}
	public void setER3000_PS_bar(float eR3000_PS_bar) {
		ER3000_PS_bar = eR3000_PS_bar;
	}
	public float getPPL() {
		return PPL;
	}
	public void setPPL(float pPL) {
		PPL = pPL;
	}
	public float getPPM() {
		return PPM;
	}
	public void setPPM(float pPM) {
		PPM = pPM;
	}
	public float getPPH() {
		return PPH;
	}
	public void setPPH(float pPH) {
		PPH = pPH;
	}
	public float getIWO_V() {
		return IWO_V;
	}
	public void setIWO_V(float iWO_V) {
		IWO_V = iWO_V;
	}
	public float getIW0_P() {
		return IW0_P;
	}
	public void setIW0_P(float iW0_P) {
		IW0_P = iW0_P;
	}
	public float getIW2_T() {
		return IW2_T;
	}
	public void setIW2_T(float iW2_T) {
		IW2_T = iW2_T;
	}
	public float getL0_H() {
		return L0_H;
	}
	public void setL0_H(float l0_H) {
		L0_H = l0_H;
	}
	public float getPend_STATION() {
		return Pend_STATION;
	}
	public void setPend_STATION(float pend_STATION) {
		Pend_STATION = pend_STATION;
	}
}
