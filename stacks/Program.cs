﻿


Stack<string> stack = new Stack<string>();
stack.Push("test1");
stack.Push("test2");
stack.Push("test3");
stack.Push("test4");

Console.WriteLine(stack.Count() == 0);
foreach (string item in stack)
{
    Console.WriteLine(item);
}

