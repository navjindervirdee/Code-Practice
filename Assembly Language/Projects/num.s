	AREA program,code,readonly
entry
	LDR R0, val1
	LDR R1, val2
	
	AREA program,data,readonly
val1 DCD &00000003
val2 DCD &00000004
	END