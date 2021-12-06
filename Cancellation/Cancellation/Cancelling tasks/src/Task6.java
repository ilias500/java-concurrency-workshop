import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;

public class Task6 {

	Callable<Void> task(Runnable onComplete, Runnable onInterrupt) {
		return () -> {
			Instant start = Instant.now();
			while(Duration.between(start, Instant.now()).toMillis() < 1000) {
				//doing work...
				//TODO Here
			}
			onComplete.run();
			return null;
		};
	}

}