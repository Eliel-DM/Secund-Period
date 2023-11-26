section .data
	msg1 db 'Insira o primeiro valor: ', 0xa
	cont1 equ $ - msg1
	msg2 db 'Inria o segundo valor: ', 0xa
	cont2 equ $ - msg2
	msg3 db 'Resultado da divisao: '
	cont3 equ $ - msg3
	msg4 db 'Resto da divisao: '
	cont4 equ $ - msg4
section .bss
	n1 resb 1
	n2 resb 1
	r resb 1
	resto resb 1
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

	mov al, [n1]
	mov bl, [n2]
	sub al, '0'
	sub bl, '0'
	div bl
	add al, '0'
	add ah, '0'
	mov [r], al
	mov [resto], ah
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

	mov eax, 4
	mov ebx, 1
	mov ecx, msg4
	mov edx, cont4
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, resto
	mov edx, 1
	int 0x80

exit:

	mov eax, 1
	int 0x80
