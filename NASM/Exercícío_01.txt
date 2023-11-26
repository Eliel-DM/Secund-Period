section .data

	
	;Eliel Dias Matos
	;Organização e arquitetura de computadores, Segundo Período.

    msg1 db 'Digite o número desejado: ', 0xa
    cont_msg1 equ $ - msg1
    msg2 db 'Valor inserido é inválido.', 0xa
    cont_msg2 equ $ - msg2
    pacin db ' ', 0xa
    cont_pacin equ $ - pacin
section .bss
    n1 resb 1
    n2 resb 1

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

    mov al, [n1]
    mov bl, '6'
    sub al, '0'
    sub bl, '0'
    cmp al,bl
    jge invalid
    jl laco
    
invalid:

    mov eax, 4
    mov ebx, 1
    mov ecx, msg2
    mov edx, cont_msg2
    int 0x80
    jmp _start
    
laco:

    mov eax, 4
    mov ebx, 1
    mov ecx, n1
    mov edx, 1
    int 0x80
    
    mov eax, 4
    mov ebx, 1
    mov ecx, pacin
    mov edx, cont_pacin
    int 0x80
    
    mov al, [n1]
    mov bl, '9'
    sub al, '0'
    sub bl, '0'
    cmp al,bl
    jl incre
    jmp exit
    
incre:

    mov al, [n1]
    inc al
    mov [n1], al
    jmp laco

exit:
    mov eax, 1
    int 0x80