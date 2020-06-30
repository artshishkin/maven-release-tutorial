#16 Maven Release Plugin Tutorial

##160-161 Maven SCM Configuration
- add `maven-release-plugin`
- configure `scm`
- configure `setting.xml` to connect to `server` github
- set property `<project.scm.id>` to `git` - server id from `settings.xml`

##162 Maven Release Prepare and Perform
- `mvn clean release:prepare`
- `mvn  release:perform`

##163 Maven Release Rollback
- `mvn clean release:prepare`
- `mvn clean release:rollback`
- delete Tag with  Atlassian Sourcetree


