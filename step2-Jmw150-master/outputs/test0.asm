; Symbol table GLOBAL
; name cur type INT location 0x20000000
; name test type STRING location 0x10000000 value "Hello World\n"

.section .text
;Current temp: null
;IR Code: 
LA t1, 0x10000000
PUTS t1
LI t2, 7
PUTI t2
LI t3, 0
HALT


.section .strings
0x10000000 "Hello World\n"
