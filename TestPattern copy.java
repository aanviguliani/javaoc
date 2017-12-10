public class TestPattern
{
 public static void main( String [] args )
 {
 // Create Publisher & Subscriber objects
 MySubscriber aSubscriber = new MySubscriber();
 MyPublisher aPublisher = new MyPublisher( 3 );

 // Register a Subscriber
 aPublisher.register( aSubscriber );

 // Increment Publisher object to cause state changes
 aPublisher.increment();
 aPublisher.increment();
 aPublisher.increment();
 aPublisher.increment();
 }
}