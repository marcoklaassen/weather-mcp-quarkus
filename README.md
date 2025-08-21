# MCP Server - Weather Germany

This is a simple MCP Server written in Quarkus to get Weather Information from Germany. 
It uses the `https://brightsky.dev/docs/#/` API to get the information. 

## Integration 

### Claude Desktop

* Download & Install Claude: https://claude.ai/download
* Build the `weather-mcp-quarkus` application with `./mvnw package`
* Go to `~/Library/Application Support/Claude` (in case of Mac)
* Open the file `claude_desktop_config.json` with an editor
* Insert the MCP Server:
```
{
    "mcpServers": {
        "weather": {
            "command": "java",
            "args": ["-jar",
                    "<path-to-your-project>/target/weather-mcp-quarkus-1.0.0-SNAPSHOT-runner.jar"]
        }
    }
}
```

* ask about the weather in Germany: 

![Claude Chat](img/chat.png)


## FAQ
Where to find Logs when using Claude as clients: `~/Library/Logs/Claude`