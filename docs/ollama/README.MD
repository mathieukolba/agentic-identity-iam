## Ollama

For this project, we need Ollama (https://ollama.com) installed and running locally

in the spring repo "ollama pull qwen3:8b"

verify if ollama is running 

# Linux
systemctl status ollama        # expect "active (running)"
systemctl is-enabled ollama    # expect "enabled" (confirms auto-start on boot)

# macOS
curl http://localhost:11434    # Verify it's up by looking for the llama icon in the menu bar, or check the port: 

# Windows
curl http://localhost:11434    # runs as a background app with a system-tray icon
Get-Process ollama             # confirms the process is alive

The reason for this decision was the direct GPU access. This is the simplest
path to full GPU acceleration and keeps inference latency low and
predictable. Local inference speed is the whole point of running the model on
our own hardware, so we optimize for it.
