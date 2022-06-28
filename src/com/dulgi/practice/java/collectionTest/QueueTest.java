package com.dulgi.practice.java.collectionTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {


	public QueueTest() {
	}

	/* add()
	* Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, 
	* returning true upon success and throwing an IllegalStateExceptionif no space is currently available.
	*
	* Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	* When using a capacity-restricted queue, this method is generally preferable to add(E), 
	* which can fail to insert an element only by throwing an exception.
	* 즉, add와 offer의 차이는 add는 큐가 차있으면 예외를 발생시키고, offer는 false를 반환한다. 그러면 그냥 다 offer를 쓰지 왜..?
	*/
	public static void main(String[] args) {
		Queue queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.offer(4);


		queue.forEach(e->System.out.print(e));
		System.out.println();

		System.out.println(queue.peek());
		queue.forEach(e->System.out.print(e));
		System.out.println();

		System.out.println(queue.poll());
		queue.forEach(e->System.out.print(e));

		//즉, 그냥 그냥 List로서 사용했을 때와의 차이는 참조한 자료를 바로 삭제할 수 있다는 장점에 있다.
		//자료를 참조한 후에 삭제해야 하는 경우가 있다면 Queue를 사용하는게 어떨까 하는게 지금의 내 생각이다
		//그냥 LinkedList로 바로 쓰면 되지 않을까 싶지만 그건 객체지향의 원칙이 어긋나서가 아닐까 싶다
		
		LinkedList list = new LinkedList<>();
		list.add(1);
		list.offer(2);

		list.forEach(e->System.out.println(e));
		System.out.println();
		
		list.poll();
		list.forEach(e->System.out.println(e));
		System.out.println();
		
		
		Queue queue2 = new ArrayBlockingQueue<>(5);
		System.out.println("아무것도 없을때 큐 사이즈 : " + queue2.size());
		try {
		queue2.add(1);
		queue2.add(2);
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);
		queue2.add(6);
		}catch(IllegalStateException e) {
			System.out.println("풀이 꽉 찼습니다.");
			queue2.clear();
		}
		queue2.forEach(e->System.out.println(e));
		//에러가 난다고 해서 전의 작업이 rollback 되지는 않는다. 
		//즉, 예외처리는 트랜잭션 처리를 담당해주는 아주 중요한 역할을 한다
		


	}

}
