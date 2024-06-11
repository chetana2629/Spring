package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceWithAround {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {

	}

	private void takeSeats() {
		System.out.println("Please take your seats : Around");
	}

	private void turnOffMobile() {
		System.out.println("Please turn of Mobile: Around");
	}

	private void clap() {
		System.out.println("Clap Clap Clap Clap: Around");
	}

	private void demandForRefund() {
		System.out.println("Please Give our money back: Around");
	}

	private void leave() {
		System.out.println("Byee by Leaving now: Around");
	}

	@Around("myPointCut()")
	public void monitorPerfomance(ProceedingJoinPoint joinPoint) {
		takeSeats();
		turnOffMobile();
		try {
			joinPoint.proceed();
			clap();
		} catch (Throwable e) {

			demandForRefund();
		}

		leave();

	}
}
