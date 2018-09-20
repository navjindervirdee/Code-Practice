	AREA program1,code,readonly
entry
main
	LDR R0,val1
	LDR R1,val2
	MOV R4,R0
	 SUBS R0,R0,R1
  	  MOVS R3, #0x00
	  CMP R0,R3
	  BEQ ABC
	  BNE CDE
ABC MOVS R2, #0x00
	 CMP R0,R3
	 BEQ DEF
CDE MOVS R2, #0x01
DEF

	AREA program2,data,readonly
val1 DCD &00000003
val2 DCD &00000004
	END
	END
	