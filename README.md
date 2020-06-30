#16 Maven Release Plugin Tutorial

##160-161 Maven SCM Configuration
- add `maven-release-plugin`
- configure `scm`
- configure `setting.xml` to connect to `server` github
- set property `<project.scm.id>` to `git` - server id from `settings.xml`

##162 Maven Release Prepare and Perform
- `mvn clean release:prepare`
- `mvn release:perform`

##163 Maven Release Rollback
- `mvn clean release:prepare`
- `mvn release:rollback`
- delete Tag with  Atlassian Sourcetree

##164 Maven Release Example Error
- added dependency to `SNAPSHOT` version
- `mvn clean release:prepare`
- Got an error: 
```Can't release project due to non released dependencies :...SNAPSHOT```
- `mvn release:clean` (because we hot release.properties)

##165 Maven Release Dry Run
- `mvn clean release:prepare -DdryRun`
- check everything is correct
- `mvn release:clean`

##166 CircleCI Configuration
