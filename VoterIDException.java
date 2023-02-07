public class VoterIDException extends Exception
{
public VoterIDException(int age)
{
s.o.p("Your age is"+age);

}
public static void verifyAge(int age)
{
if(age<18)
{
try
{
throw new VoterIDException(age);
}
catch(Exception e)
{
s.o.p("Please check your age");
}

}

}
}