package com.keyword;

class Project             // class Project depends on the class BackEndDeveloper and class FrontEndDeveloper.
                         // This violates Dependency Inversion Principle.
{
    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
    public void implement()
    {
        backEndDeveloper.developer();
        frontEndDeveloper.developer();
    }


}

class BackEndDeveloper
{
    public void developer()
    {
        System.out.println("This is Back end Developer");
    }
}
class FrontEndDeveloper
{
    public void developer()
    {
        System.out.println("This is Front end Developer");
    }
}

public class DependencyInversionNotUsing
{
    public static void main(String[] args)
    {
        Project project = new Project();
        project.implement();
    }
}
