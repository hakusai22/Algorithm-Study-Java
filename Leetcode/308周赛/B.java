import java.util.Stack;

/**
 * Copyright (c) 2022, Bongmi
 * All rights reserved
 * Author: yinpeng@bongmi.com
 */


class B {
  public String removeStars(String s) {
    Stack<Character> stk = new Stack<>();
    for (Character c : s.toCharArray()) {
      if (c.equals('*'))
        stk.pop();
      else
        stk.push(c);
    }
    StringBuilder sb = new StringBuilder();
    for (Character c : stk) {
      sb.append(c);
    }
    return sb.toString();
  }
}

