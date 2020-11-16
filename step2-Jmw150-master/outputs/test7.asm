; Symbol table GLOBAL
; name a type INT location 0x20000000
; name b type INT location 0x20000004
; name c type INT location 0x20000008
; name d type INT location 0x2000000c

.section .text
;Current temp: null
;IR Code: 
LA t3, 0x20000000
LI t1, 2
NEG t2, t1
SW t2, 0(t3)
LA t5, 0x20000004
LI t4, 5
SW t4, 0(t5)
LA t11, 0x20000008
LA t6, 0x20000000
LW t7, 0(t6)
LA t8, 0x20000004
LW t9, 0(t8)
MUL t10, t7, t9
SW t10, 0(t11)
LA t12, 0x20000008
LW t13, 0(t12)
PUTI t13
LA t17, 0x2000000c
LA t14, 0x20000008
LW t15, 0(t14)
NEG t16, t15
SW t16, 0(t17)
LA t18, 0x2000000c
LW t19, 0(t18)
PUTI t19
LI t20, 0
HALT


.section .strings
