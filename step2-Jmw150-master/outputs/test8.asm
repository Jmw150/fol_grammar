; Symbol table GLOBAL
; name a type INT location 0x20000000
; name b type INT location 0x20000004
; name c type INT location 0x20000008
; name d type INT location 0x2000000c
; name prompt type STRING location 0x10000000 value "Enter a number: "

.section .text
;Current temp: null
;IR Code: 
LA t2, 0x20000000
LI t1, 1
SW t1, 0(t2)
LA t4, 0x20000004
LI t3, 2
SW t3, 0(t4)
LA t5, 0x10000000
PUTS t5
LA t6, 0x20000008
GETI t7
SW t7, 0(t6)
LA t13, 0x20000000
LW t14, 0(t13)
LA t8, 0x20000004
LW t9, 0(t8)
LA t10, 0x20000008
LW t11, 0(t10)
MUL t12, t9, t11
ADD t15, t14, t12
PUTI t15
LI t16, 0
HALT


.section .strings
0x10000000 "Enter a number: "
