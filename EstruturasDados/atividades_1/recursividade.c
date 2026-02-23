#include <stdio.h>

int potenciacao(int x, int y)
{   if(y == 0) return 1;
    else return x * potenciacao(x, y-1);
}

int main()
{   int base, expoente;
    printf("Digite a base: ");
    scanf("%d", &base);
    printf("Digite o expoente: ");
    scanf("%d", &expoente);
    printf("%d elevado a %d = %d\n", base, expoente, potenciacao(base, expoente));
    return 0;
}
