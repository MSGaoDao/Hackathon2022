public class MockExecutorLoader implements ExecutorLoader {
	public void unassignExecutor(int executionId) throws ExecutorManagerException {
		executionExecutorMapping.remove(executionId);
	}
}