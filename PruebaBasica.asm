mov eax, dword [s]
sub eax, 2
mov dword [b], eax
cmp 3, 3
jl mov dword [a], 2
mov dword [c], 2
SECTION .bss
bbb resb 2
s resb 2
b resb 4
a resb 4
c resb 4
