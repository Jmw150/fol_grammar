; Symbol table GLOBAL
; name a type INT location 0x20000000
; name b type INT location 0x20000004
; name c type INT location 0x20000008
; name d type INT location 0x2000000c

.section .text
;Current temp: null
;IR Code: 
LA t2, 0x20000000
LI t1, 1
SW t1, 0(t2)
LA t4, 0x20000004
LI t3, 2
SW t3, 0(t4)
LA t6, 0x20000008
LI t5, 3
SW t5, 0(t6)
LA t17, 0x2000000c
LI t7, 2
LA t8, 0x20000004
LW t9, 0(t8)
LA t10, 0x20000008
LW t11, 0(t10)
ADD t12, t9, t11
MUL t13, t7, t12
LA t14, 0x20000000
LW t15, 0(t14)
DIV t16, t13, t15
SW t16, 0(t17)
LA t18, 0x2000000c
LW t19, 0(t18)
PUTI t19
LI t20, 0
HALT


.section .strings
