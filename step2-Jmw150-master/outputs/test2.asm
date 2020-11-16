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
LA t15, 0x2000000c
LA t12, 0x20000000
LW t13, 0(t12)
LA t7, 0x20000004
LW t8, 0(t7)
LA t9, 0x20000008
LW t10, 0(t9)
MUL t11, t8, t10
ADD t14, t13, t11
SW t14, 0(t15)
LA t16, 0x2000000c
LW t17, 0(t16)
PUTI t17
LI t18, 0
HALT


.section .strings
