section .data

	msg1 db 'Digite o primeiro valor:', 0xa
	cont equ $ -msg1

	msg2 db 'Digite o segundo valor:', 0xa
	cont2 equ $ -msg2

	msg3 db 'O valor da soma :', 0xa
	cont3 equ $ -msg3


section .bss

	valor1 resb 1
	valor2 resb 1
	total resb 1

section .text

	global _start
_start:

	mov eax, 4
	mov ebx, 1
	mov ecx, msg1
	mov edx, cont
	int 0x80

	mov eax, 3
	mov ebx, 0
	mov ecx, valor1
	mov edx, 2
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg2
	mov edx, cont2
	int 0x80

	mov eax, 3
	mov ebx, 0
	mov ecx, valor2
	mov edx, 2
	int 0x80

	mov al, [valor1]
	mov bl, [valor2]
	sub al, '0'
	sub bl, '0'
	add al,bl
	add al, '0'
	mov [total], al
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, msg3
	mov edx, cont3
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, total
	mov ebx, 2
	int 0x80

exit:
	mov eax, 1
	int 0x80

