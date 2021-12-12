diff --git a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildClient.java b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildClient.java
index 5cc6b83..47ea74f 100644
--- a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildClient.java
+++ b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildClient.java
@@ -96,14 +96,14 @@
                         SubstrateServerMessage serverCommand = new Gson().fromJson(line, SubstrateServerMessage.class);
                         Consumer<String> selectedConsumer = null;
                         switch (serverCommand.command) {
-                            case o:
+                            case WRITE_OUT:
                                 selectedConsumer = out;
                                 break;
-                            case e:
+                            case WRITE_ERR:
                                 selectedConsumer = err;
                                 break;
-                            case s:
-                                /* Exit with ServerCommand.s (exit status sent by server) */
+                            case SEND_STATUS:
+                                /* Exit with exit status sent by server */
                                 return Integer.valueOf(serverCommand.payload);
                             default:
                                 throw new RuntimeException("Invalid command sent by the image build server: " + serverCommand.command);
@@ -112,12 +112,12 @@
                             selectedConsumer.accept(serverCommand.payload);
                         }
                     }
-                    /* Report failure if communication does not end with ServerCommand.s */
+                    /* Report failure if communication does not end with ExitStatus */
                     return EXIT_FAIL;
                 }
             }
         } catch (IOException e) {
-            if (!ServerCommand.version.toString().equals(command)) {
+            if (!ServerCommand.GET_VERSION.toString().equals(command)) {
                 errln.accept("Could not connect to image build server running on port " + port);
                 errln.accept("Underlying exception: " + e);
             }
