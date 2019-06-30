Lab Exercise 7, CS 401:

The purpose of this lab is to make sure everyone has a github account and can work with a repository. It is best to do 
this with your fellow team members, but not required.

If you have not already done so, create a github account.

This and the next step are covered nicely in this video: http://bits.netbeans.org/media/github_nb.mp4 You can do this
with just the basic Java Application project

Create a project on NetBeans

From the Team > git menu, initialize a repository in this project.

Commit the initial files (Note that this includes NetBeans-specific files.)

Create a project on github. If you are working with at least some of your teammates, just create one project (so you'll 
have the same URL to submit at the end)

Push your project to this repository – the Team > Remote > Push will do this. You can also reach it by right-clicking on
 your project and looking for the git submenu

[Editing this step after looking at more documentation]

For other members of the team, it looks like the recommended approach is to fork the repository on github and then clone
 your fork to your local machine: see https://help.github.com/articles/fork-a-repo/

Suggestion: use a different project for your future homework assignments. Keep this one for experimenting with git's 
different commands

Add a file to the repository:

Use the file created for the project, or create a new Hello.java

If not already added, add it to the source-controlled files

Make some change to the file and commit it

Other team members should be able to edit it and commit their changes

Pull the latest version from github to see that you can see your partners' changes

Branches: These commands are under the Team > Branch/Tag menu

create a new branch (if doing as a team, one for each team member)

Switch back to the master branch

Edit Hello.java (or whatever you called it) in the master branch and commit your changes

Switch back to the new branch (observe that the file is back to what it was before your edit)

Merge that change to your new branch (from Team > Merge revision, select the Master branch to merge into the current 
branch)

make changes to Hello.java in your new branch and commit the changes

merge the changes back to the master branch

Push all of these changes (include all branches) back to the remote repository on github (If you login to github, you 
should see the changes)

For team members who are not the project owner, after you push (because you are working on your fork), create a pull 
request on the owner's repository. Go to the repository page on github and click on the “Pull Requests” tab at the top 
(3rd tab from the left).

The project owner still has to accept the pull request

What to submit: which user names on github are yours (you will have one name per account you have), the URL for this 
exercise
