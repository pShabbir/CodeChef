#include<stdio.h>
int myPower(int a)
{

    int x=2,count=1;
    if(a==1)
        count=0;
    else
    {
        while(x!=a)
        {
            x=x*2;
            count++;
        }
    }
    return count;
}
int cal()
{
    int a,b,count=0;
    scanf("%d",&a);
    scanf("%d",&b);
    b=myPower(b);
    if(a==1)
        a=0;
    else{
        if(a%2==0)
        {
            a=myPower(a);
        }
        else
        {
            count++;
            a=(a-1)/2;
            a=myPower(a);
        }
    }
    a=(b-a);
    if(a<0)
        a=a*-1;
    count += a;
    return count;
}
int main()
{
    int n,a[200],i=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        a[i]=cal();
    printf("\n");
    for(i=0;i<n;i++)
        printf("%d\n",a[i]);

    return 0;

}

