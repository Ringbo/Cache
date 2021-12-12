diff --git a/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/notebook/NotebookTest.java b/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/notebook/NotebookTest.java
index e2c18d2..d1666b9 100644
--- a/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/notebook/NotebookTest.java
+++ b/zeppelin-zengine/src/test/java/com/nflabs/zeppelin/notebook/NotebookTest.java
@@ -55,14 +55,14 @@
 		Paragraph p1 = note.addParagraph();
 		p1.setText("hello world");
 		note.run(p1.getId());
-		while(p1.getStatus()==Status.READY || p1.isTerminated()==false) Thread.yield();
+		while(p1.isTerminated()==false || p1.getResult()==null) Thread.yield();
 		assertEquals("repl1: hello world", p1.getResult().message());
 		
 		// run with specific repl
 		Paragraph p2 = note.addParagraph();
 		p2.setText("%MockRepl2 hello world");
 		note.run(p2.getId());
-		while(p2.getStatus()==Status.READY || p2.isTerminated()==false) Thread.yield();
+		while(p2.isTerminated()==false || p2.getResult()==null) Thread.yield();
 		assertEquals("repl2: hello world", p2.getResult().message());
 	}
 	
