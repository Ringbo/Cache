diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
index 73abe81..7e8ff73 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
@@ -366,7 +366,7 @@
 	 * test tree. param serverResponse to be added to allow saving of the
 	 * server's response while recording. A future consideration.
 	 */
-	public void deliverSampler(HTTPSamplerBase sampler, TestElement[] subConfigs, SampleResult result) {
+	public synchronized void deliverSampler(HTTPSamplerBase sampler, TestElement[] subConfigs, SampleResult result) {
 		if (filterContentType(result) && filterUrl(sampler)) {
 			JMeterTreeNode myTarget = findTargetControllerNode();
 			Collection defaultConfigurations = findApplicableElements(myTarget, ConfigTestElement.class, false);
