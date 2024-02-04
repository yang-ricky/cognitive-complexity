import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sayhello")
public class HelloWorldMojo extends AbstractMojo {

    @Parameter(property = "sayhello.greeting", defaultValue = "Hello World")
    private String greeting;

    public void execute() throws MojoExecutionException {
        getLog().info(greeting);
    }
}
