section .data

	
	;Eliel Dias Matos
	;Organização e arquitetura de computadores, Segundo Período.

	msg1 db "Digite o primeiro valor: ", 
	cont_msg1 equ $ - msg1

	msg2 db "Digite o segundo valor: ", 
	cont_msg2 equ $ - msg2

	msg3 db "Resultado da soma: ", 
	cont_msg3 equ $ - msg3

	msg4 db "Resultado da subtração: ", 
	cont_msg4 equ $ - msg4

	msg5 db "Resultado da multiplicação: ", 
	cont_msg5 equ $ - msg5

	msg6 db "Resultado da divisão: ", 
	cont_msg6 equ $ - msg6
	
section .bss

	n1 resb 1
	n2 resb 1
	rs resb 1
	rsub resb 1
	rm resb 1
	rd resb 1
	

section .text
    global _start
_start:

	mov eax, 4
	mov ebx, 1
	mov ecx, msg1
	mov edx, cont_msg1
	int 0x80

	mov eax, 3
	mov ebx, 0
	mov ecx, n1
	mov edx, 2
	int 0x80

	mov eax, 4 
	mov ebx, 1
	mov ecx, msg2
	mov edx, cont_msg2
	int 0x80

	mov eax, 3
	mov ebx, 0
	mov ecx, n2
	mov edx, 2
	int 0x80
	
	;divisão
	mov al, [n1]
    	mov bl, [n2]
    	sub al, '0'
    	sub bl, '0'
    	div bl
   	add al, '0'
    	mov [rd], al
    	int 0x80


	;soma				
	mov al, [n1]
	mov bl, [n2]
	sub al, '0'
	sub bl, '0'
	add al, bl
	add al, '0'
	mov [rs], al
	int 0x80

	;Subtração
	mov al, [n1]
	mov bl, [n2]
	sub al, '0'
	sub bl, '0'
	sub al, bl
	add al, '0'
	mov [rsub], al
	int 0x80

	;Multiplicação
	mov eax, [n1]
	mov ebx, [n2]
	sub eax, '0'
	sub ebx, '0'
	mul ebx
	add eax, '0'
	mov [rm], eax
	int 0x80
    
	mov eax, 4
	mov ebx, 1
	mov ecx, msg3
	mov edx, cont_msg3
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, rs
	mov edx, 1
	int 0x80

    	mov eax, 4
   	mov ebx, 1
   	 mov [ecx], byte 0xa
	mov edx, 1
    	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg4
	mov edx, cont_msg4
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, rsub
	mov edx, 1
	int 0x80
	
	mov eax, 4
    	mov ebx, 1
    	mov [ecx], byte 0xa
    	mov edx, 1
    	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg5
	mov edx, cont_msg5
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, rm
	mov edx, 1
	int 0x80
	
	mov eax, 4
    	mov ebx, 1
    	mov [ecx], byte 0xa
    	mov edx, 1
    	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg6
	mov edx, cont_msg6
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, rd
	mov edx, 1
	int 0x80

exit:
	mov eax, 1
	int 0x80

