diff --git a/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java b/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
index d9f6f41..f231c1d 100644
--- a/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
+++ b/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
@@ -81,7 +81,7 @@
 	public void startServlet() throws Exception {
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 		assertThat(getResponse("http://localhost:8080/hello"), equalTo("Hello World"));
 	}
 
@@ -90,7 +90,7 @@
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		factory.setPort(0);
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 		this.thrown.expect(ConnectException.class);
 		this.thrown.expectMessage("Connection refused");
 		getResponse("http://localhost:8080/hello");
@@ -100,7 +100,7 @@
 	public void stopServlet() throws Exception {
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 		this.container.stop();
 		this.thrown.expect(ConnectException.class);
 		getResponse("http://localhost:8080/hello");
@@ -111,7 +111,7 @@
 	public void restartWithKeepAlive() throws Exception {
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 
 		MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
 		HttpClient client = new HttpClient(connectionManager);
@@ -121,7 +121,7 @@
 
 		this.container.stop();
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 
 		GetMethod get2 = new GetMethod("http://localhost:8080/hello");
 		assertThat(client.executeMethod(get2), equalTo(200));
@@ -131,7 +131,7 @@
 	@Test
 	public void startServletAndFilter() throws Exception {
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
-		this.container = factory.getEmbdeddedServletContainer(
+		this.container = factory.getEmbeddedServletContainer(
 				exampleServletRegistration(), new FilterRegistrationBean(
 						new ExampleFilter()));
 		assertThat(getResponse("http://localhost:8080/hello"), equalTo("[Hello World]"));
@@ -143,7 +143,7 @@
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		final Date[] date = new Date[1];
 		this.container = factory
-				.getEmbdeddedServletContainer(new ServletContextInitializer() {
+				.getEmbeddedServletContainer(new ServletContextInitializer() {
 					@Override
 					public void onStartup(ServletContext servletContext)
 							throws ServletException {
@@ -163,7 +163,7 @@
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		factory.setPort(8081);
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 		assertThat(getResponse("http://localhost:8081/hello"), equalTo("Hello World"));
 	}
 
@@ -172,7 +172,7 @@
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		factory.setContextPath("/say");
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 		assertThat(getResponse("http://localhost:8080/say/hello"), equalTo("Hello World"));
 	}
 
@@ -202,7 +202,7 @@
 	public void doubleStop() throws Exception {
 		ConfigurableEmbeddedServletContainerFactory factory = getFactory();
 		this.container = factory
-				.getEmbdeddedServletContainer(exampleServletRegistration());
+				.getEmbeddedServletContainer(exampleServletRegistration());
 		this.container.stop();
 		this.container.stop();
 	}
@@ -216,7 +216,7 @@
 		}
 		factory.setInitializers(Arrays.asList(initializers[2], initializers[3]));
 		factory.addInitializers(initializers[4], initializers[5]);
-		this.container = factory.getEmbdeddedServletContainer(initializers[0],
+		this.container = factory.getEmbeddedServletContainer(initializers[0],
 				initializers[1]);
 		InOrder ordered = inOrder((Object[]) initializers);
 		for (ServletContextInitializer initializer : initializers) {
@@ -230,7 +230,7 @@
 				new FileWriter(this.temporaryFolder.newFile("test.txt")));
 		AbstractEmbeddedServletContainerFactory factory = getFactory();
 		factory.setDocumentRoot(this.temporaryFolder.getRoot());
-		this.container = factory.getEmbdeddedServletContainer();
+		this.container = factory.getEmbeddedServletContainer();
 		assertThat(getResponse("http://localhost:8080/test.txt"), equalTo("test"));
 	}
 
