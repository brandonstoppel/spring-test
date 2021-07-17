package org.bstoppel.advice;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Aspect
@Component
@Slf4j
//@ConditionalOnExpression("${aspect.enabled:true}")
public class ExecutionTimeAdvice {
	//	@Around("@annotation(org.bstoppel.annotation.TrackExecutionTime)")
	//	public Object executionTime(final ProceedingJoinPoint point) throws Throwable {
	//		final var start = Instant.now();
	//		final var object = point.proceed();
	//		log.info("duration:{}", Duration.between(start, Instant.now()).toMillis());
	//		return object;
	//	}
}
