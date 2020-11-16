; Symbol table GLOBAL
; name a type INT location 0x20000000
; name b type INT location 0x20000004

.section .text
;Current temp: null
;IR Code: 
LA t2, 0x20000000
LI t1, 10
SW t1, 0(t2)
LA t4, 0x20000004
LI t3, 5
SW t3, 0(t4)
LA t5, 0x20000000
LW t6, 0(t5)
LA t7, 0x20000004
LW t8, 0(t7)
DIV t9, t6, t8
PUTI t9
LI t10, 0
HALT


.section .strings
