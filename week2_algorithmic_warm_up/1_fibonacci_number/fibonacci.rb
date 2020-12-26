
def calc_fib(n)
  return n if n <= 1
  numbers = Array.new(n,1)
  $i = 2
  $num = n

  while $i < $num  do
    numbers[$i] = numbers[$i-1] + numbers[$i-2]
    $i += 1
  end
  return numbers[n-1]
end

if __FILE__ == $0
  n = gets.to_i
  puts "#{calc_fib(n)}"
end
