SECTION .text
global start
start:
mov eax, dword [s]
sub eax, 2
mov dword [b], eax
;----------Inicio funcion------------
fi :
push ebp
mov ebp, esp
sub esp, 0
;----------IF---------
push eax
mov eax, dword [e]
sub eax, 3
cmp eax, 0
pop eax
jl Else_label_0
mov dword [a], 2
;----------IF---------
push eax
mov eax, dword [a]
sub eax, 3
cmp eax, 0
pop eax
jg Else_label_1
mov dword [b], 3
Exit_label_1 :
;-------Fin if-------
mov eax, dword [h]
sub eax, 3
mov dword [z], eax
jump Exit_label_0
Else_label_0 :
;----------IF---------
push eax
mov eax, dword [a]
sub eax, 3
cmp eax, 0
pop eax
jg Else_label_2
mov dword [b], 3
Exit_label_2 :
;-------Fin if-------
Exit_label_0 :
;-------Fin if-------
;----------While---------
While_label_3 :
push eax
mov eax, dword [a]
sub eax, 3
cmp eax, 0
pop eax
jl While_exit_label_3
mov dword [a], 3
jump While_label_3
While_exit_label_3 :
;---------Fin While---------
mov eax,  3
mov esp, ebp
pop ebp
ret
;----------Fin funcion------------
SECTION .bss
z resb 4
bbb resb 2
s resb 2
b resb 4
a resb 4
c resb 4
