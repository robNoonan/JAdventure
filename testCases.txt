
Below is the output for a successful run through test cases.
Maven is REQUIRED for executing any of the test cases and for running the game
This run of test cases is accomplished by running

'mvn test'


[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< com.github.progether:jadventure >-------------------
[INFO] Building Java Text Adventure 0.4.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.1:prepare-agent (jacoco-initialize) @ jadventure ---
[INFO] argLine set to -javaagent:C:\\Users\\radda\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.1\\org.jacoco.agent-0.8.1-runtime.jar=destfile=C:\\Users\\radda\\Desktop\\4110_JAdventure\\JAdventure\\target\\jacoco.exec,append=true,output=file
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ jadventure ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ jadventure ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- build-helper-maven-plugin:1.9.1:add-test-resource (add-source) @ jadventure ---
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ jadventure ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 2 resources to target/test-classes
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ jadventure ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ jadventure ---
[INFO] Surefire report directory: C:\Users\radda\Desktop\4110_JAdventure\JAdventure\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.jadventure.game.conversation.ConversationManagerTest
Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.083 sec - in com.jadventure.game.conversation.ConversationManagerTest
Running com.jadventure.game.conversation.LineTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.conversation.LineTest
Running com.jadventure.game.entities.EntityTest
Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.entities.EntityTest
Running com.jadventure.game.entities.PlayerTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.062 sec - in com.jadventure.game.entities.PlayerTest
Running com.jadventure.game.items.ItemTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.items.ItemTest
Running com.jadventure.game.items.StorageTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.items.StorageTest
Running com.jadventure.game.monsters.MonsterFactoryTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 sec - in com.jadventure.game.monsters.MonsterFactoryTest
Running com.jadventure.game.monsters.MonsterTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec - in com.jadventure.game.monsters.MonsterTest
Running com.jadventure.game.navigation.CoordinateTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 sec - in com.jadventure.game.navigation.CoordinateTest
Running com.jadventure.game.navigation.LocationTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.navigation.LocationTest
Running com.jadventure.game.prompts.CommandCollectionTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.403 sec - in com.jadventure.game.prompts.CommandCollectionTest
Running com.jadventure.game.repository.EncounteredNpcRepositoryTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.repository.EncounteredNpcRepositoryTest
Running com.jadventure.game.repository.ItemRepositoryTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec - in com.jadventure.game.repository.ItemRepositoryTest
Running com.jadventure.game.repository.LocationRepositoryTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.01 sec - in com.jadventure.game.repository.LocationRepositoryTest
Running com.jadventure.game.repository.NpcRepositoryTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in com.jadventure.game.repository.NpcRepositoryTest

Results :




Tests run: 72, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.809 s
[INFO] Finished at: 2020-05-03T00:34:08-04:00
[INFO] ------------------------------------------------------------------------
