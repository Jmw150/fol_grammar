; Symbol table GLOBAL
; name a type FLOAT location 0x20000000
; name b type FLOAT location 0x20000004
; name c type FLOAT location 0x20000008
; name d type FLOAT location 0x2000000c
; name prompt type STRING location 0x10000000 value "Enter a number: "

.section .text
;Current temp: null
;IR Code: 
LA t1, 0x20000000
FIMM.S f1, 1.3
FSW f1, 0(t1)
LA t2, 0x20000004
FIMM.S f2, 2.5
FSW f2, 0(t2)
LA t3, 0x10000000
PUTS t3
LA t4, 0x20000008
GETF f3
FSW f3, 0(t4)
LA t7, 0x20000000
FLW f7, 0(t7)
LA t5, 0x20000004
FLW f4, 0(t5)
LA t6, 0x20000008
FLW f5, 0(t6)
FMUL.S f6, f4, f5
FADD.S f8, f7, f6
PUTF f8
LI t8, 0
HALT


.section .strings
0x10000000 "Enter a number: "
