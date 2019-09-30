from flask import Flask
import random
app = Flask(__name__)

@app.route("/")
def home():
    return str(random.randrange(0,1000000))
    
if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8000)
