class StarPattern
{
    public static void main(String[] args)
    {

    }
    public static void startP1(int num)
    {
        for(int  i = 0 ; i <= num ; i++)
        {
            for(int j = i ; j <= num ; j++)
                System.out.print("*");
        }
        System.out.println();
    }
}