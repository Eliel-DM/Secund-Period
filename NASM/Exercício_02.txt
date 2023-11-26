section .data

	;Eliel Dias Matos
	;Organização e arquitetura de computadores, Segundo Período.



    pacin db ' ', 0xa
    cont_pacin equ $ - pacin

	msg1 db 'Digite o primeiro valor:', 0xa
	cont equ $ -msg1

	msg2 db 'Digite o segundo valor:', 0xa
	cont2 equ $ -msg2

    somada db 'O valor da soma: '
	cont_somada equ $ - somada

    subt db 'O valor da Subtração: '
    cont_subt equ $ - subt
    
    mult db 'O valor da Multiplicação: '
    cont_mult equ $ - mult
    
    divi db 'O valor da Divisão: '
    cont_divi equ $ - divi
    
    restada db 'O valor do resto: '
    cont_restada equ $ - restada
    
    msg4 db 'Qual operação deseja fazer ?', 0xa
    cont4 equ $ - msg4
    
    oper db ' "1" Soma. "2"  Subtração. "3" Multiplicação.  "4" Divisão. ', 0xa
    cont_oper equ $ - oper
    

    
section .bss

	valor1 resb 1
	valor2 resb 1
	total resb 1
    resto resb 1
    var resb 1
    
section .text

	global _start
_start:

    ; leitura das variáveis 
    
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
	
	mov eax, 4
	mov ebx, 1
	mov ecx, msg4
	mov edx, cont4
	int 0x80
	
	mov eax, 4
	mov ebx, 1
	mov ecx, oper
	mov edx, cont_oper
	int 0x80
	
	mov eax, 3
	mov ebx, 0
	mov ecx, var
	mov edx, 2
	int 0x80
	
	;Definição da operação 
	 
	mov al, [var]
	mov bl, '4'
	cmp al,bl
	je didi ; Divisão
	int 0x80
	    
	mov al, [var]
	mov bl, '1'
	cmp al,bl
	je soso ; soma
	int 0x80
	
	mov al,[var]
	mov bl, '2'
	cmp al,bl
	je susu ; subtração
	int 0x80
	
	mov al, [var]
	mov bl, '3'
	cmp al,bl
	je mumu ; multiplicação
	int 0x80
	

	
	; Área das operações
	
didi: ; divisão

	mov al, [valor1]
	mov bl, [valor2]
	sub al, '0'
	sub bl, '0'
	div bl
	add al, '0'
	add ah, '0'
	mov [total], al
	mov [resto], ah
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, divi
	mov edx, cont_divi
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, total
	mov edx, 1
	int 0x80
   
    mov eax, 4
    mov ebx, 1
    mov ecx, pacin
    mov edx, cont_pacin
    int 0x80
    
	mov eax, 4
	mov ebx, 1
	mov ecx, restada
	mov edx, cont_restada
	int 0x80
	
	mov eax, 4
	mov ebx, 1
	mov ecx, resto
	mov edx, 1
	int 0x80
	jmp exit

mumu: ; multiplicação

	mov  eax, [valor1]
	mov  ebx, [valor2]
	sub eax, '0'
	sub ebx, '0'
	mul ebx
	add eax, '0'
	mov [total], eax
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, mult
	mov edx, cont_mult
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, total
	mov edx, 1
	int 0x80
	jmp exit
	
susu: ; subtração

	mov al, [valor1]
	mov bl, [valor2]
	sub al, '0'
	sub bl, '0'
	sub al,bl
	add al, '0'
	mov [total], al
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, subt
	mov edx, cont_subt
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, total
	mov edx, 1
	int 0x80
    jmp exit
    
soso: ; soma


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
	mov ecx, somada
	mov edx, cont_somada
	int 0x80

	mov eax, 4
	mov ebx, 1
	mov ecx, total
	mov edx, 1
	int 0x80
    jmp exit

; Fim área das operações

exit:
	mov eax, 1
	int 0x80

