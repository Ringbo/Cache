diff --git a/web/src/main/java/org/openmrs/web/Listener.java b/web/src/main/java/org/openmrs/web/Listener.java
index dd63212..4a15bd5 100644
--- a/web/src/main/java/org/openmrs/web/Listener.java
+++ b/web/src/main/java/org/openmrs/web/Listener.java
@@ -243,7 +243,7 @@
 			// start the scheduled tasks
 			SchedulerUtil.startup(getRuntimeProperties());
 		}
-		catch (Throwable t) {
+		catch (Exception t) {
 			Context.shutdown();
 			WebModuleUtil.shutdownModules(servletContext);
 			throw new ServletException(t);
@@ -558,7 +558,7 @@
 				}
 			}
 		}
-		catch (Throwable e) {
+		catch (Exception e) {
 			System.err.println("Listener.contextDestroyed: Failed to cleanup drivers in webapp");
 			e.printStackTrace();
 		}
@@ -592,7 +592,7 @@
 	 * @throws ModuleMustStartException if the context cannot restart due to a
 	 *             {@link MandatoryModuleException} or {@link OpenmrsCoreModuleException}
 	 */
-	public static void performWebStartOfModules(ServletContext servletContext) throws ModuleMustStartException, Throwable {
+	public static void performWebStartOfModules(ServletContext servletContext) throws ModuleMustStartException, Exception {
 		Log log = LogFactory.getLog(Listener.class);
 		
 		List<Module> startedModules = new ArrayList<Module>();
@@ -632,7 +632,7 @@
 							try {
 								ModuleFactory.stopModule(mod, true, true);
 							}
-							catch (Throwable t3) {
+							catch (Exception t3) {
 								// just keep going if we get an error shutting down.  was probably caused by the module 
 								// that actually got us to this point!
 								log.trace("Unable to shutdown module:" + mod, t3);
@@ -646,7 +646,7 @@
 					throw new MandatoryModuleException(ex.getModuleId(), "Got an error while starting a mandatory module: "
 					        + e.getMessage() + ". Check the server logs for more information");
 				}
-				catch (Throwable t2) {
+				catch (Exception t2) {
 					// a mandatory or core module is causing spring to fail to start up.  We don't want those
 					// stopped so we must report this error to the higher authorities
 					log.warn("caught another error: ", t2);
