section .data

	msg1 db 'Insira o primeiro numero: ', 0xa
	cont1 equ $ - msg1
	msg2 db 'Insira o segundo numero: ', 0xa
	cont2 equ $ - msg2
	msg3 db 'Resultado: ', 0xa
	cont3 equ $ - msg3

section .bss

	n1 resb 1 
	n2 resb 1
	r resb 1

section .text

global _start

_start:


	mov eax, 4
	mov ebx, 1
	mov ecx, msg1
	mov edx, cont1
	int 0x80

	mov eax, 3
	mov ebx, 0
	mov ecx, n1
	mov edx, 2
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg2
	mov edx, cont2
	int 0x80

	mov eax, 3
	mov ebx, 0
	mov ecx, n2
	mov edx, 2
	int 0x80

	mov  eax, [n1]
	mov  ebx, [n2]
	sub eax, '0'
	sub ebx, '0'
	mul ebx
	add eax, '0'
	mov [r], eax
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg3
	mov edx, cont3
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, r
	mov edx, 1
	int 0x80


exit:

	mov eax, 1
	int 0x80
