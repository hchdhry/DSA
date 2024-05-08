LinkedList<string> theList = new LinkedList<string>();
theList.AddFirst("test1");
LinkedListNode<string>? linkedListNode = theList.Last;
theList.AddAfter(linkedListNode,"ksmkxsmxk");



foreach (var item in theList)
{
    Console.WriteLine(item);
}