; Symbol table GLOBAL
; name a type INT location 0x20000000
; name b type FLOAT location 0x20000004
; name c type FLOAT location 0x20000008

.section .text
;Current temp: null
;IR Code: 
LA t1, 0x20000004
FIMM.S f1, 2.5
FSW f1, 0(t1)
LA t3, 0x20000008
LA t2, 0x20000004
FLW f3, 0(t2)
FIMM.S f2, 1.0
FADD.S f4, f3, f2
FSW f4, 0(t3)
LA t5, 0x20000000
LI t4, 2
SW t4, 0(t5)
LA t6, 0x20000008
FLW f5, 0(t6)
PUTF f5
LA t7, 0x20000000
LW t8, 0(t7)
PUTI t8
LA t9, 0x20000000
LW t10, 0(t9)
HALT


.section .strings
