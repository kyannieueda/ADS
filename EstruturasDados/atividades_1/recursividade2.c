#include <stdio.h>
int serieFib(int n) {
    if (n == 1)
        return 0;
    if (n == 2)
        return 1;

    return serieFib(n - 1) + serieFib(n - 2);
}

int main() {
    int n;

    printf("Digite a posição desejada: ");
    scanf("%d", &n);

    printf("Resultado na posição %d = %d\n", n, serieFib(n));

    return 0;
}
