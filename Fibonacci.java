class Fibonacci{

public static int fibonacci(int n) {
   if (n < 0)
  return -1;
   if (n >= 2)
   {
  return fibonacci(n-2) + fibonacci(n-1);
   }
   else
   {
  return n;
   }
}
}
