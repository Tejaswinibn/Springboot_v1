# Git Commands to Push Your Project

## Step 1: Add all files
```bash
git add .
```

## Step 2: Commit
```bash
git commit -m "Initial commit: Fundamentals First API - Step 1 & 2 complete"
```

## Step 3: Add your remote repository
```bash
git remote add origin <your-repository-url>
```

Example:
```bash
git remote add origin https://github.com/yourusername/fundamentals-first-api.git
```

## Step 4: Push to GitHub
```bash
git branch -M main
git push -u origin main
```

---

## Alternative: If you already have a remote
```bash
git remote -v  # Check existing remotes
git push -u origin main
```

---

## Quick One-Liner (if remote already set):
```bash
git add . && git commit -m "Initial commit: Fundamentals First API" && git push -u origin main
```

