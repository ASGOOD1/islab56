method between(p: int, r: int) returns (q: int)
    requires r-p > 1
    ensures p<q<r
{
    q := p + 1;
}



method Main()
{
  var q:int;
  q := between(2, 5);   print(q);
}